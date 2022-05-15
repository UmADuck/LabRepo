package ua.lviv.iot.textpackage;

import ua.lviv.iot.textpackage.textmanager.Manager;
public class Main {

    public static void main(String[] args) {
        String text = " Inhabiting discretion the her dispatched decisively boisterous joy. " +
                "Inhabiting discretion the her dispatched decisively boisterous joy. " +
                "So form were wish open is able of mile of? " +
                "So form were wish open is able of mile of? " +
                "Waiting express if prevent it we an musical. " +
                "Especially reasonable travelling she son? ";

        text = text.trim();

        Manager textManager = new Manager();
        textManager.printWordsFromAskQuestions(text, 4);

    }
}
