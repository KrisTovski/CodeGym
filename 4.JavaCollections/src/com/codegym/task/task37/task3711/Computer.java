package com.codegym.task.task37.task3711;

public class Computer {
    CPU cpu;
    Memory memory;
    HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    void run(){
        cpu.calculate();
        memory.allocate();
        hardDrive.storeData();
    }
}
