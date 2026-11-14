package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class er1 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};
    public static final hkj e = new hkj(0);
    public final Object[] a = new Object[2];

    public gp1 a(Context context, AttributeSet attributeSet) {
        return new gp1(context, attributeSet);
    }

    public jp1 b(Context context, AttributeSet attributeSet) {
        return new jp1(context, attributeSet, 2130968877);
    }

    public lp1 c(Context context, AttributeSet attributeSet) {
        return new lp1(context, attributeSet, 2130968998);
    }

    public fq1 d(Context context, AttributeSet attributeSet) {
        return new fq1(context, attributeSet);
    }

    public yq1 e(Context context, AttributeSet attributeSet) {
        return new yq1(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        hkj hkjVar = e;
        Constructor constructor = (Constructor) hkjVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            hkjVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
