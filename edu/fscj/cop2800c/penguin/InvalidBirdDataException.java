// InvalidBirdDataException.java
// Gabriela Hernandez
// 11/16/2026
// Custom exception for invalid bird data

package edu.fscj.cop2800c.penguin;

public class InvalidBirdDataException extends Exception {
    public InvalidBirdDataException(String message) {
        super(message);
    }
}