package com.directi.training.ocp.exercise;

public abstract class Resource {

    public abstract void markFree(int id);

    public abstract void markBusy(int id);

    public abstract int findFree();
}
