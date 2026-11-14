package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xp4 {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public byte g;
    public byte h;

    /* JADX WARN: Multi-variable type inference failed */
    public xp4(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i2;
    }

    public final void a(char c) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                wp4 wp4Var = (wp4) arrayList.get(size);
                int i = wp4Var.c;
                if (i != length) {
                    return;
                }
                wp4Var.c = i - 1;
            }
        }
    }

    public final x36 c(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.e + this.f;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            i5 = (this.g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.g != 2 || i4 <= 0) ? 0 : 2 : 1;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 32 - length;
            }
            f = ((i3 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.g == 1) {
            i6 -= this.h - 1;
        }
        return new x36(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, LinearLayoutManager.INVALID_OFFSET, f, i5, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, LinearLayoutManager.INVALID_OFFSET, 0.0f, 0);
    }

    public final SpannableString d() {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i6 >= arrayList.size()) {
                break;
            }
            wp4 wp4Var = (wp4) arrayList.get(i6);
            boolean z2 = wp4Var.b;
            int i8 = wp4Var.a;
            if (i8 != 8) {
                if (i8 == 7) {
                    z = true;
                } else {
                    i5 = yp4.B[i8];
                    z = false;
                }
            }
            int i9 = wp4Var.c;
            i6++;
            if (i9 != (i6 < arrayList.size() ? ((wp4) arrayList.get(i6)).c : length)) {
                if (i2 == -1) {
                    i = 33;
                    if (z2) {
                        i2 = i9;
                    }
                } else if (z2) {
                    i = 33;
                } else {
                    i = 33;
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i9, 33);
                    i2 = -1;
                }
                if (i3 != -1) {
                    if (!z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i9, i);
                        i3 = -1;
                    }
                } else if (z) {
                    i3 = i9;
                }
                if (i5 != i4) {
                    if (i4 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i7, i9, 33);
                    }
                    i4 = i5;
                    i7 = i9;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
        }
        if (i7 != length && i4 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i7, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
