package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GameTest {
    @Mock
    Map mockMap;

    @Test
    public void testPlaceTower_ValidPosition() {
        when(mockMap.isValidPosition(3, 4)).thenReturn(true);
        mockMap.placeTower(new CannonTower(), 3, 4);
        verify(mockMap).placeTower(any(Tower.class), eq(3), eq(4));
    }

    @Test
    public void testPlaceTower_InvalidPosition() {
        when(mockMap.isValidPosition(3, 4)).thenReturn(false);
        mockMap.placeTower(new CannonTower(), 3, 4);
        verify(mockMap, never()).placeTower(any(Tower.class), eq(3), eq(4));
    }
    @Test
    public void testAttack_EnemyInRange() {
        List<Enemy> enemies = Arrays.asList(new BasicEnemy());
        enemies.get(0).setPosition(2, 2);
        Tower tower = new CannonTower();
        tower.setPosition(2, 1);
        tower.attack(enemies);
        // Verificar que el enemigo ha recibido daño
        assertEquals(50, enemies.get(0).getHealth());
    }


}
