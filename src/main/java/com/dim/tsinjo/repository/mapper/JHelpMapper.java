package com.dim.tsinjo.repository.mapper;

import com.dim.tsinjo.model.Don;
import com.dim.tsinjo.model.Help;
import com.dim.tsinjo.repository.model.JDon;
import com.dim.tsinjo.repository.model.JHelp;

import java.util.function.Function;

public class JHelpMapper implements Function<Help, JHelp> {
    @Override
    public JHelp apply(Help help) {
        return new JHelp();
    }
}
