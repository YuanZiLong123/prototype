package com.study.prototype.shallow;

import com.study.prototype.ReferenceDemo;

public class ShallowCloneTest {

    public static void main(String[] args) {
        ShallowCloneDome shallowCloneDome = new ShallowCloneDome();
        ReferenceDemo referenceDemo = new ReferenceDemo();
        shallowCloneDome.setName("shallow");
        shallowCloneDome.setReferenceDemo(referenceDemo);
        ShallowCloneDome otherShallowClondDome = shallowCloneDome.clone();
        System.out.println(shallowCloneDome.getReferenceDemo()==otherShallowClondDome.getReferenceDemo());
        System.out.println(shallowCloneDome.getName()+"/"+otherShallowClondDome.getName());
    }
}
