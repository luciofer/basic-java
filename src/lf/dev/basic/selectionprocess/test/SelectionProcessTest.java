package lf.dev.basic.selectionprocess.test;

import lf.dev.basic.selectionprocess.domain.SelectionProcess;

public class SelectionProcessTest {
    public static void main(String[] args) {
        SelectionProcess selector = new SelectionProcess();
        
        selector.candidateSelection();
        selector.printSelectedCandidates();
        

    }
}
