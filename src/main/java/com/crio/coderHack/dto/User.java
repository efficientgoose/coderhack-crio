package com.crio.coderHack.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String username;
    private int score;
    private List<Badge> badges = new ArrayList<>();
    
}
