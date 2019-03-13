package com.study.prototype.shallow;

import com.study.prototype.ReferenceDemo;

import java.io.Serializable;

public class ShallowCloneDome implements  Cloneable {


    private ReferenceDemo referenceDemo;

    private String name;

    public ReferenceDemo getReferenceDemo() {
        return referenceDemo;
    }

    public void setReferenceDemo(ReferenceDemo referenceDemo) {
        this.referenceDemo = referenceDemo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShallowCloneDome clone(){
        ShallowCloneDome shallowCloneDome = new ShallowCloneDome();
        shallowCloneDome.setName(this.name);
        shallowCloneDome.setReferenceDemo(this.referenceDemo);
        return  shallowCloneDome;
    }
}
