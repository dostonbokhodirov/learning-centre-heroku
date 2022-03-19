package uz.learn.learningcentre.enums;

import java.util.Arrays;

public enum AuthRole {

    SUPER_ADMIN, ADMIN, MANAGER, TEACHER, ACCOUNTANT, ASSISTANT;

    public static boolean isAuthRole(AuthRole role) {
        return Arrays.stream(values()).anyMatch(authRole -> authRole.name().equals(String.valueOf(role)));
    }
}
