package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.SessionManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class co4 extends nmd {
    public final /* synthetic */ omd A;
    public final /* synthetic */ byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co4(omd omdVar, Context context, int i, byte b) {
        super(context, i);
        this.z = b;
        this.A = omdVar;
    }

    public final void onCreate(Bundle bundle) {
        switch (this.z) {
            case 0:
                super.onCreate(bundle);
                ListView listView = (ListView) findViewById(2131363573);
                if (listView != null) {
                    final AdapterView.OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
                    final byte b = 0;
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: bo4
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                            byte b2 = b;
                            Object obj = onItemClickListener;
                            Object obj2 = this;
                            switch (b2) {
                                case 0:
                                    AdapterView.OnItemClickListener onItemClickListener2 = (AdapterView.OnItemClickListener) obj;
                                    ((do4) ((co4) obj2).A).getClass();
                                    cod codVar = (cod) adapterView.getItemAtPosition(i);
                                    if (codVar != null && codVar.g) {
                                        SessionManager sessionManager = CastContext.getSharedInstance().getSessionManager();
                                        if (sessionManager.getCurrentCastSession() != null) {
                                            sessionManager.endCurrentSession(false);
                                        }
                                        fr3.i = codVar.c;
                                    }
                                    if (onItemClickListener2 != null) {
                                        onItemClickListener2.onItemClick(adapterView, view, i, j);
                                        break;
                                    }
                                    break;
                                default:
                                    ((ro9) obj2).b = i;
                                    ((tj9) obj).d(i);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                super.onCreate(bundle);
                ListView listView2 = (ListView) findViewById(2131363573);
                if (listView2 != null) {
                    pmd pmdVar = (pmd) this.A;
                    Objects.requireNonNull(pmdVar);
                    listView2.setOnItemClickListener(new ou(pmdVar, (byte) 1));
                    new Handler().postDelayed(new vl9(this, (byte) 13), 3000L);
                    break;
                }
                break;
        }
    }
}
