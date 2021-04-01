/*
 * Tai-e: A Static Analysis Framework for Java
 *
 * Copyright (C) 2020-- Tian Tan <tiantan@nju.edu.cn>
 * Copyright (C) 2020-- Yue Li <yueli@nju.edu.cn>
 * All rights reserved.
 *
 * Tai-e is only for educational and academic purposes,
 * and any form of commercial use is disallowed.
 * Distribution of Tai-e is disallowed without the approval.
 */

package pascal.taie;

/**
 * Interface for {@link World} builder.
 */
public interface WorldBuilder {

    /**
     * Build a new instance of {@link World} and make it globally accessible
     * through static methods of {@link World}.
     */
    void build(Options options);
}
