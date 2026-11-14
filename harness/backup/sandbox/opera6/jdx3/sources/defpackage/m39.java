package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.service.autofill.FillCallback;
import android.service.autofill.FillRequest;
import android.service.autofill.FillResponse;
import android.service.autofill.SaveInfo;
import android.view.autofill.AutofillId;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.widget.inline.InlinePresentationSpec;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m39 {
    public final Context a;
    public final as2 b;
    public final ub2 c;
    public final vu2 d;
    public final FillRequest e;
    public final CancellationSignal f;
    public final FillCallback g;
    public final zyk h;
    public final zyk i;

    public m39(Context context, as2 as2Var, x77 x77Var, ub2 ub2Var, vu2 vu2Var, FillRequest fillRequest, CancellationSignal cancellationSignal, FillCallback fillCallback) {
        this.a = context;
        this.b = as2Var;
        this.c = ub2Var;
        this.d = vu2Var;
        this.e = fillRequest;
        this.f = cancellationSignal;
        this.g = fillCallback;
        final byte b = 0;
        this.h = z4c.b(new Function0(this) { // from class: l39
            public final /* synthetic */ m39 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                m39 m39Var = this.b;
                switch (b2) {
                    case 0:
                        return new s45(m39Var.e.getClientState());
                    default:
                        return m39.d(m39Var);
                }
            }
        });
        final byte b2 = 1;
        this.i = z4c.b(new Function0(this) { // from class: l39
            public final /* synthetic */ m39 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                m39 m39Var = this.b;
                switch (b22) {
                    case 0:
                        return new s45(m39Var.e.getClientState());
                    default:
                        return m39.d(m39Var);
                }
            }
        });
    }

    public static final InlinePresentationSpec d(m39 m39Var) {
        InlineSuggestionsRequest inlineSuggestionsRequest;
        List<InlinePresentationSpec> inlinePresentationSpecs = (Build.VERSION.SDK_INT < 30 || (inlineSuggestionsRequest = m39Var.e.getInlineSuggestionsRequest()) == null) ? null : inlineSuggestionsRequest.getInlinePresentationSpecs();
        if (inlinePresentationSpecs != null) {
            return yt7.a(CollectionsKt.firstOrNull(inlinePresentationSpecs));
        }
        return null;
    }

    public final void a(FillResponse.Builder builder, d16 d16Var) {
        SaveInfo.Builder builder2 = new SaveInfo.Builder(((Number) d16Var.a.getValue()).intValue(), (AutofillId[]) d16Var.b.getValue());
        Bundle bundle = b().a;
        builder.setSaveInfo(builder2.setFlags((bundle != null ? (AutofillId) ((Parcelable) j14.T(bundle, "com.opera.android.autofill.EXTRA_PASSWORD_FIELD_ID", AutofillId.class)) : null) == null ? 4 : 1).build());
    }

    public final s45 b() {
        return (s45) this.h.getValue();
    }

    public final InlinePresentationSpec c() {
        return yt7.a(this.i.getValue());
    }
}
