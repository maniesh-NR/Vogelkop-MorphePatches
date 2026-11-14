package com.opera.android.autofill;

import android.os.CancellationSignal;
import android.service.autofill.AutofillService;
import android.service.autofill.FillCallback;
import android.service.autofill.FillContext;
import android.service.autofill.FillRequest;
import android.service.autofill.SaveCallback;
import android.service.autofill.SaveRequest;
import com.opera.android.OperaApplication;
import defpackage.ajf;
import defpackage.as2;
import defpackage.bjf;
import defpackage.j4c;
import defpackage.vx;
import defpackage.xu2;
import defpackage.zif;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/android/autofill/OperaAutofillService;", "Landroid/service/autofill/AutofillService;", "<init>", "()V", "autofill-service"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaAutofillService extends AutofillService {
    public static final /* synthetic */ int d = 0;
    public as2 b;
    public final zyk a = z4c.b(new zif(this, (byte) 0));
    public final j4c c = new j4c(new vx(this, (byte) 29), (byte) 0);

    public static boolean a(FillContext fillContext) {
        String packageName = fillContext.getStructure().getActivityComponent().getPackageName();
        return (c.q(packageName, "com.opera.browser", false) || c.q(packageName, "com.android.settings", false)) ? false : true;
    }

    @Override // android.service.autofill.AutofillService
    public final void onDisconnected() {
        super.onDisconnected();
        as2 as2Var = this.b;
        if (as2Var != null) {
            as2Var.d = null;
        }
        this.b = null;
    }

    @Override // android.service.autofill.AutofillService
    public final void onFillRequest(FillRequest fillRequest, CancellationSignal cancellationSignal, FillCallback fillCallback) {
        List<FillContext> fillContexts = fillRequest.getFillContexts();
        if (!(fillContexts instanceof Collection) || !fillContexts.isEmpty()) {
            Iterator<T> it = fillContexts.iterator();
            while (it.hasNext()) {
                if (!a((FillContext) it.next())) {
                    fillCallback.onSuccess(null);
                    return;
                }
            }
        }
        as2 as2Var = this.b;
        if (as2Var == null) {
            as2Var = (as2) ((OperaApplication) ((xu2) this.a.getValue())).f.get();
            this.b = as2Var;
        }
        as2Var.a(this, new ajf(this, fillRequest, cancellationSignal, fillCallback, fillCallback));
    }

    @Override // android.service.autofill.AutofillService
    public final void onSaveRequest(SaveRequest saveRequest, SaveCallback saveCallback) {
        List<FillContext> fillContexts = saveRequest.getFillContexts();
        if (!(fillContexts instanceof Collection) || !fillContexts.isEmpty()) {
            Iterator<T> it = fillContexts.iterator();
            while (it.hasNext()) {
                if (!a((FillContext) it.next())) {
                    saveCallback.onFailure("SaveRequest not accepted");
                    return;
                }
            }
        }
        as2 as2Var = this.b;
        if (as2Var == null) {
            as2Var = (as2) ((OperaApplication) ((xu2) this.a.getValue())).f.get();
            this.b = as2Var;
        }
        as2Var.a(this, new bjf(this, saveRequest, saveCallback, saveCallback, (byte) 0));
    }
}
