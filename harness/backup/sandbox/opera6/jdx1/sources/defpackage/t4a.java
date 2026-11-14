package defpackage;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class t4a extends ViewGroup.MarginLayoutParams {
    public static final int c = (-2147483647) - LinearLayoutManager.INVALID_OFFSET;
    public static final byte d = 2;
    public static final byte e = 3;
    public static final byte f = 4;
    public static final byte g = 5;
    public static final byte h = 6;
    public static final byte i = 7;
    public static final byte j = 8;
    public static final byte k = 9;
    public static final byte l = 11;
    public static final byte m = 12;
    public static final byte n = 13;
    public static final byte o = 10;
    public v4a a;
    public v4a b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4a)) {
            return false;
        }
        t4a t4aVar = (t4a) obj;
        return this.b.equals(t4aVar.b) && this.a.equals(t4aVar.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i2, int i3) {
        ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i2, -2);
        ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i3, -2);
    }
}
