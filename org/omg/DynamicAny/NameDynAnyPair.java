package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameDynAnyPair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Saturday, October 19, 2019 7:00:37 AM PDT
*/

public final class NameDynAnyPair implements org.omg.CORBA.portable.IDLEntity
{

  /**
          * The name associated with the DynAny.
          */
  public String id = null;

  /**
          * The DynAny value associated with the name.
          */
  public org.omg.DynamicAny.DynAny value = null;

  public NameDynAnyPair ()
  {
  } // ctor

  public NameDynAnyPair (String _id, org.omg.DynamicAny.DynAny _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameDynAnyPair
