package defpackage;

import J.N;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.function.Supplier;
import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final class ntn extends iz4 implements Callback {
    public final ChromiumContent a;
    public final Supplier b;

    public ntn(ChromiumContent chromiumContent, Supplier supplier) {
        this.a = chromiumContent;
        this.b = supplier;
    }

    @Override // defpackage.iz4
    public final void A(ChromiumContent chromiumContent) {
        int iIntValue = ((Integer) this.b.get()).intValue();
        chromiumContent.v = iIntValue;
        long j = chromiumContent.n;
        if (j == 0) {
            return;
        }
        if (chromiumContent.w) {
            iIntValue = -16777216;
        }
        N.MGUpE$PE(j, iIntValue);
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        ChromiumContent chromiumContent = this.a;
        chromiumContent.v = iIntValue;
        long j = chromiumContent.n;
        if (j == 0) {
            return;
        }
        if (chromiumContent.w) {
            iIntValue = -16777216;
        }
        N.MGUpE$PE(j, iIntValue);
    }

    @Override // defpackage.iz4
    public final void r(ChromiumContent chromiumContent, boolean z) {
        chromiumContent.w = true;
        long j = chromiumContent.n;
        if (j == 0) {
            return;
        }
        N.MGUpE$PE(j, -16777216);
    }

    @Override // defpackage.iz4
    public final void s(ChromiumContent chromiumContent) {
        chromiumContent.w = false;
        long j = chromiumContent.n;
        if (j == 0) {
            return;
        }
        N.MGUpE$PE(j, chromiumContent.v);
    }
}
