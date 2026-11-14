package defpackage;

import android.text.style.ClickableSpan;
import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* loaded from: classes.dex */
public final class jsk implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public /* synthetic */ jsk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue = true;
        switch (this.a) {
            case 0:
                Object obj = this.b;
                Method method = (Method) this.c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    rqd.p(e);
                    return false;
                }
            case 1:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((vtd) this.c).U(menuItem));
            default:
                ((ClickableSpan) this.b).onClick((TextViewWithClickableSpans) this.c);
                return true;
        }
    }
}
