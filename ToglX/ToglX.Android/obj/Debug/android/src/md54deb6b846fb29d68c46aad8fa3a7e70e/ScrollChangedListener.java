package md54deb6b846fb29d68c46aad8fa3a7e70e;


public class ScrollChangedListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnScrollChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrollChanged:()V:GetOnScrollChangedHandler:Android.Views.ViewTreeObserver/IOnScrollChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("C1.Android.Core.ScrollChangedListener, C1.Android.Core, Version=2.3.20171.134, Culture=neutral, PublicKeyToken=null", ScrollChangedListener.class, __md_methods);
	}


	public ScrollChangedListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ScrollChangedListener.class)
			mono.android.TypeManager.Activate ("C1.Android.Core.ScrollChangedListener, C1.Android.Core, Version=2.3.20171.134, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onScrollChanged ()
	{
		n_onScrollChanged ();
	}

	private native void n_onScrollChanged ();

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
