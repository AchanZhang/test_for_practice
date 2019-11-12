package com.achanzhang.highConcurrency.publishExample;

import lombok.extern.slf4j.Slf4j;
import net.jcip.annotations.NotThreadSafe;

@Slf4j
@NotThreadSafe
public class EscapeExample {

    private int thisCanBeEscape = 0;

    public EscapeExample(){
        new InnerClass();
    }

    private class InnerClass{

        public InnerClass(){
            log.info("{}",EscapeExample.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new EscapeExample();
    }
}
