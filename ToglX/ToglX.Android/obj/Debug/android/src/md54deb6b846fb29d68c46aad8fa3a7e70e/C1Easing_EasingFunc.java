package md54deb6b846fb29d68c46aad8fa3a7e70e;


public class C1Easing_EasingFunc
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.TimeInterpolator
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getInterpolation:(F)F:GetGetInterpolation_FHandler:Android.Animation.ITimeInterpolatorInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("C1.Android.Core.C1Easing+EasingFunc, C1.Android.Core, Version=2.3.20171.134, Culture=neutral, PublicKeyToken=null", C1Easing_EasingFunc.class, __md_methods);
	}


	public C1Easing_EasingFunc () throws java.lang.Throwable
	{
		super ();
		if (getClass () == C1Easing_EasingFunc.class)
			mono.android.TypeManager.Activate ("C1.Android.Core.C1Easing+EasingFunc, C1.Android.Core, Version=2.3.20171.134, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public float getInterpolation (float p0)
	{
		return n_getInterpolation (p0);
	}

	private native float n_getInterpolation (float p0);

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
