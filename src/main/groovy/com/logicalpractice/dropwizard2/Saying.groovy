package com.logicalpractice.dropwizard2

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@XmlRootElement
@XmlAccessorType( XmlAccessType.NONE )
class Saying {
    @XmlElement
    private final long id;
    @XmlElement
    private final String content;

    public Saying() {}

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}