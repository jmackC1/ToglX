package md54deb6b846fb29d68c46aad8fa3a7e70e;


public class GlobalLayoutListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("C1.Android.Core.GlobalLayoutListener, C1.Android.Core, Version=2.3.20171.134, Culture=neutral, PublicKeyToken=null", GlobalLayoutListener.class, __md_methods);
	}


	public GlobalLayoutListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GlobalLayoutListener.class)
			mono.android.TypeManager.Activate ("C1.Android.Core.GlobalLayoutListener, C1.Android.Core, Version=2.3.20171.134, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
