package org.muslim.handlers;


import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

import java.util.Optional;

/**
 * The request handler for {@link LaunchRequest}
 */
public class LaunchRequestHandler implements com.amazon.ask.dispatcher.request.handler.impl.LaunchRequestHandler {

    private static final String CARD_TITLE = "Prayer Times Reminder";
    private static final String CARD_TEXT = """
            Welcome to the Prayer Times Reminder Skill, I can create daily prayer reminders for you.
            Just say 'Create daily prayer time reminders'.
            """;

    @Override
    public boolean canHandle(HandlerInput handlerInput, LaunchRequest launchRequest) {
        return true;
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput, LaunchRequest launchRequest) {
        return handlerInput.getResponseBuilder()
                .withSpeech(CARD_TEXT)
                .withSimpleCard(CARD_TITLE, CARD_TEXT)
                .withReprompt(CARD_TEXT)
                .build();
    }
}
