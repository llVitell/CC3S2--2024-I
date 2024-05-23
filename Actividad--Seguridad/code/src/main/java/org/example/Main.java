package org.example;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main (String args[]) throws NoSuchAlgorithmException {
        //
        AttackTreeNode rootNode = new AttackTreeNode("virus infects a file",5,0.6);
        AttackTreeNode node1 = new AttackTreeNode("virus run as an administrator",8,0.3);
        AttackTreeNode node2 = new AttackTreeNode("virus run as a normal user",4,0.7);

        rootNode.addChild(node1);
        rootNode.addChild(node2);

        //
        AttackTreeNode node1_1 = new AttackTreeNode("virus exploits root hole",7,0.2);
        AttackTreeNode node1_2 = new AttackTreeNode("virus run by an admin",3,0.8);

        node1.addChild(node1_1);
        node1.addChild(node1_2);

        AttackTreeNode node2_1 = new AttackTreeNode("Other infected programs",6,0.4);
        AttackTreeNode node2_2 = new AttackTreeNode("User downloads and runs infected naked binary",4,0.6);

        node2.addChild(node2_1);
        node2.addChild(node2_2);

        //
        AttackTreeNode node1_2_1 = new AttackTreeNode("Other infected programs",4,0.5);
        AttackTreeNode node1_2_2 = new AttackTreeNode("Virus infects install package",6,0.3);
        AttackTreeNode node1_2_3 = new AttackTreeNode("Admin downloads and runs infected naked binary",8,0.2);

        node1_2.addChild(node1_2_1);
        node1_2.addChild(node1_2_2);
        node1_2.addChild(node1_2_3);

        //
        AttackTree arbolAtaque = new AttackTree(rootNode);
        System.out.println("Riesgo total: " + arbolAtaque.calculateTotalRisk());
        System.out.println("Critical Path: " + arbolAtaque.findCriticalPath());

        /* --------------------------------------------------- */

//        Permission permiso = new Permission("permisoSala5","acceso a las maquinas Sala 5");
//        Role programador = new Role("programador");
//
//        programador.addPermission(permiso);
//
//        User usuario = new User("Alumno","1q2a3z");
//        usuario.addRole(programador);
//
//        if(usuario.authenticate("alumno","1q2a3z")){
//            if(usuario.hasPermission("permisoSala5")){
//                System.out.println("El usuario " + usuario.getUsername() +  " esta autenticado y tiene permiso");
//            }
//            else{
//                System.out.println("El usuario " + usuario.getUsername() +  " esta autenticado pero no tiene permiso");
//            }
//        }

    }
}
