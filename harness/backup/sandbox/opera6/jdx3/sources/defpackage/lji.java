package defpackage;

import android.print.PrintAttributes;
import android.print.PrintDocumentInfo;
import android.print.a;

/* loaded from: classes.dex */
public final class lji extends a {
    public final /* synthetic */ PrintAttributes a;
    public final /* synthetic */ qji b;

    public lji(qji qjiVar, PrintAttributes printAttributes) {
        this.a = printAttributes;
        this.b = qjiVar;
    }

    public final void onLayoutCancelled() {
        qji qjiVar = this.b;
        if (this == qjiVar.h) {
            qjiVar.a();
            qjiVar.f(0);
        }
    }

    public final void onLayoutFailed(CharSequence charSequence) {
        qji qjiVar = this.b;
        if (this == qjiVar.h) {
            qjiVar.h = null;
            h7f h7fVar = qjiVar.c;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((nji) g7fVarH.next()).b();
            }
            qjiVar.f(0);
        }
    }

    public final void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z) {
        qji qjiVar = this.b;
        if (this == qjiVar.h) {
            qjiVar.h = null;
            qjiVar.f = this.a;
            qjiVar.m = printDocumentInfo.getName();
            qjiVar.f(2);
        }
    }
}
