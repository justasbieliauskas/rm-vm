package com.github.justasbieliauskas.rmvm.refactor.instruction.arithmetic;

import com.github.justasbieliauskas.rmvm.refactor.TestAsInstruction;
import com.github.justasbieliauskas.rmvm.refactor.data.Register;
import com.github.justasbieliauskas.rmvm.refactor.data.fake.EqualityRegister;
import com.github.justasbieliauskas.rmvm.refactor.data.fake.UnchangeableRegister;
import org.junit.Test;

/**
 * Test for {@link DIV}.
 *
 * @author Justas Bieliauskas
 */
public class DIVTest
{
    @Test
    public void dividesNumberByNumber() {
        new TestAsInstruction(
            new DIV(0, 5, 3, 1),
            new Register[] {
                new EqualityRegister(1),
                new UnchangeableRegister()
            }
        ).test();
    }

    @Test
    public void dividesNumberBy0() {
        new TestAsInstruction(
            new DIV(0, 2, 0, 1),
            new Register[] {
                new UnchangeableRegister(),
                new EqualityRegister(2)
            }
        ).test();
    }
}