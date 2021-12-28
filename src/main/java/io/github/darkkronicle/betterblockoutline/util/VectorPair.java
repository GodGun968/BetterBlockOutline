package io.github.darkkronicle.betterblockoutline.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class VectorPair {

    @Getter
    private final Vector3f vectorOne;
    @Getter
    private final Vector3f vectorTwo;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof VectorPair other)) {
            return false;
        }
        if (this.vectorOne.equals(other.vectorOne) && this.vectorTwo.equals(other.vectorTwo)) {
            return true;
        }
        if (this.vectorOne.equals(other.vectorTwo) && this.vectorTwo.equals(other.vectorOne)) {
            return true;
        }
        return false;
    }
}
