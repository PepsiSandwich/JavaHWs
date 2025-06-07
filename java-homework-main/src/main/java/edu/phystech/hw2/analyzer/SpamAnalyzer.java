package edu.phystech.hw2.analyzer;

import java.util.List;

public class SpamAnalyzer extends KeywordAnalyzer {
    public SpamAnalyzer(List<String> keywords) {
        super(keywords.toArray(new String[0]));
    }
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
