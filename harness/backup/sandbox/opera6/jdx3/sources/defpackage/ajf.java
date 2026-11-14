package defpackage;

import android.os.CancellationSignal;
import android.service.autofill.FillCallback;
import android.service.autofill.FillRequest;
import com.opera.android.autofill.OperaAutofillService;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class ajf implements Callback {
    public final /* synthetic */ OperaAutofillService a;
    public final /* synthetic */ FillRequest b;
    public final /* synthetic */ CancellationSignal c;
    public final /* synthetic */ FillCallback d;
    public final /* synthetic */ FillCallback e;

    public ajf(OperaAutofillService operaAutofillService, FillRequest fillRequest, CancellationSignal cancellationSignal, FillCallback fillCallback, FillCallback fillCallback2) {
        this.a = operaAutofillService;
        this.b = fillRequest;
        this.c = cancellationSignal;
        this.d = fillCallback;
        this.e = fillCallback2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v15 og6, still in use, count: 2, list:
          (r9v15 og6) from 0x02ea: MOVE (r16v1 og6) = (r9v15 og6)
          (r9v15 og6) from 0x02c3: MOVE (r16v4 og6) = (r9v15 og6)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // com.opera.api.Callback
    public final void run(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajf.run(java.lang.Object):void");
    }
}
