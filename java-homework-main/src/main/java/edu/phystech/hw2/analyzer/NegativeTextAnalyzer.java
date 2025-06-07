package edu.phystech.hw2.analyzer;


import java.util.List;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private static final String[] NEGATIVE_EMOTICONS = {":(", "=(", ":|"};
    public NegativeTextAnalyzer() {
        super(NEGATIVE_EMOTICONS);
    }
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE;
    }
}
