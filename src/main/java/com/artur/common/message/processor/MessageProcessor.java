package com.artur.common.message.processor;

import com.artur.common.message.Message;

public interface MessageProcessor <M extends Message>{

    void process(M message);
}
