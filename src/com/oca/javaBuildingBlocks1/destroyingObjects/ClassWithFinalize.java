package com.oca.javaBuildingBlocks1.destroyingObjects;

public class ClassWithFinalize {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
