package org.example;

import org.example.game.GameService;
import org.example.map.MapService;
import org.example.player.PlayerService;
import org.example.tower.TowerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GameTest {
    @Mock
    private MapService mockMapService;
    @Mock
    private PlayerService mockPlayerService;
    @InjectMocks
    private GameService gameService;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testPlaceTower() {
        TowerService mockTower = mock(TowerService.class);
        gameService.placeTower(mockTower, 2, 2);
        verify(mockMapService).placeTower(mockTower, 2, 2);
    }
}

