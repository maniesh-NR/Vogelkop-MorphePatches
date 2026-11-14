package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d5n {
    public final int a;
    public final Class b;
    public final byte c;
    public final byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public d5n(int i, Class cls, int i2, int i3, byte b) {
        this.e = b;
        this.a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    public final void a(View view, Object obj) {
        Object tag;
        boolean zEquals;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        byte b = this.e;
        byte b2 = this.c;
        if (i >= b2) {
            switch (b) {
                case 0:
                    m5n.h(view, (CharSequence) obj);
                    break;
                case 1:
                    o5n.c(view, (CharSequence) obj);
                    break;
                default:
                    m5n.g(view, ((Boolean) obj).booleanValue());
                    break;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.a;
        if (i2 >= b2) {
            switch (b) {
                case 0:
                    tag = m5n.b(view);
                    break;
                case 1:
                    tag = o5n.b(view);
                    break;
                default:
                    tag = Boolean.valueOf(m5n.c(view));
                    break;
            }
        } else {
            tag = view.getTag(i3);
            if (!this.b.isInstance(tag)) {
                tag = null;
            }
        }
        switch (b) {
            case 0:
                zEquals = TextUtils.equals((CharSequence) tag, (CharSequence) obj);
                z = !zEquals;
                break;
            case 1:
                zEquals = TextUtils.equals((CharSequence) tag, (CharSequence) obj);
                z = !zEquals;
                break;
            default:
                Boolean bool = (Boolean) tag;
                Boolean bool2 = (Boolean) obj;
                z = !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
                break;
        }
        if (z) {
            WeakHashMap weakHashMap = r5n.a;
            View.AccessibilityDelegate accessibilityDelegateA = n5n.a(view);
            f8 f8Var = accessibilityDelegateA != null ? accessibilityDelegateA instanceof e8 ? ((e8) accessibilityDelegateA).a : new f8(accessibilityDelegateA) : null;
            if (f8Var == null) {
                f8Var = new f8();
            }
            r5n.l(view, f8Var);
            view.setTag(i3, obj);
            r5n.g(this.d, view);
        }
    }
}
