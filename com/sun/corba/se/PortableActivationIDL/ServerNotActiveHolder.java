package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ServerNotActiveHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/jenkins/workspace/build-scripts/jobs/jdk8u/jdk8u-mac-x64-hotspot/workspace/build/src/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Saturday, October 19, 2019 7:00:37 AM PDT
*/

public final class ServerNotActiveHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.ServerNotActive value = null;

  public ServerNotActiveHolder ()
  {
  }

  public ServerNotActiveHolder (com.sun.corba.se.PortableActivationIDL.ServerNotActive initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ServerNotActiveHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ServerNotActiveHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ServerNotActiveHelper.type ();
  }

}
