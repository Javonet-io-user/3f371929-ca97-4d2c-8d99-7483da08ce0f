package Tridion.ContentManager.CoreService.Client;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Tridion.ContentManager.CoreService.Client.*;
import jio.System.Runtime.Serialization.*;

public class OrphanKeywordsFilterData extends KeywordRelatedFilterData
    implements IExtensibleDataObject {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRootCategory(LinkToCategoryData value) {
    try {
      javonetHandle.set("RootCategory", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LinkToCategoryData getRootCategory() {
    try {
      Object res = javonetHandle.<NObject>get("RootCategory");
      if (res == null) return null;
      return new LinkToCategoryData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public OrphanKeywordsFilterData() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Tridion.ContentManager.CoreService.Client.OrphanKeywordsFilterData");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OrphanKeywordsFilterData(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}