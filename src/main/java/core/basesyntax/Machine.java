package core.basesyntax;

public abstract class Machine {
    protected String machine;
    public Machine(String machine) {
        this.machine = machine;
    }

    public abstract void doWork();

    public abstract void stopWork();

    @Override
    public String toString() {
        return machine;
    }
}

