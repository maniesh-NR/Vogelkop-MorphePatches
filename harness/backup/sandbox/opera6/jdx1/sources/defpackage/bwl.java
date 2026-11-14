package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class bwl extends dwl {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwl(Context context, byte b) {
        super(TopicsManager.get(context));
        this.c = b;
        switch (b) {
            case 1:
                super(TopicsManager.get(context));
                break;
            case 2:
                super(gpk.f(context.getSystemService(gpk.j())));
                break;
            case 3:
                super(gpk.f(context.getSystemService(gpk.j())));
                break;
            case 4:
                super(gpk.f(context.getSystemService(gpk.j())));
                break;
            default:
                break;
        }
    }

    @Override // defpackage.dwl
    public final GetTopicsRequest v(hx9 hx9Var) {
        switch (this.c) {
            case 0:
                return g8.c(hx9Var);
            case 1:
                return g8.c(hx9Var);
            case 2:
                return g8.c(hx9Var);
            case 3:
            default:
                return super.v(hx9Var);
            case 4:
                return g8.c(hx9Var);
        }
    }

    @Override // defpackage.dwl
    public final ix9 w(GetTopicsResponse getTopicsResponse) {
        switch (this.c) {
            case 0:
                return kg1.b(getTopicsResponse);
            case 1:
            default:
                return super.w(getTopicsResponse);
            case 2:
                return kg1.b(getTopicsResponse);
        }
    }
}
