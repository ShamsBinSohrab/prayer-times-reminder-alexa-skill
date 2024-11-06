package org.muslim;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import org.muslim.handlers.LaunchRequestHandler;

/**
 * Entry point for AWS Lambda.
 */
public class StreamHandler extends SkillStreamHandler {

    public StreamHandler() {
        super(Skills.standard()
                .addRequestHandler(new LaunchRequestHandler())
                .build());
    }
}
