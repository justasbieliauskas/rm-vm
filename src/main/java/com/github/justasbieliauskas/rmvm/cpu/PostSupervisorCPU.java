package com.github.justasbieliauskas.rmvm.cpu;

/**
 * Processor after super instruction.
 *
 * @author Justas Bieliauskas
 */
public interface PostSupervisorCPU
{
    /**
     * Creates new processor.
     *
     * @param processor old processor
     * @return new processor
     */
    UnsafeCPU with(CPU processor);
}
