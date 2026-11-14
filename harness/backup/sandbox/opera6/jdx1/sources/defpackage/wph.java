package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wph extends f8 {
    public final /* synthetic */ byte d;
    public final Object e;
    public final Object f;

    public wph(RecyclerView recyclerView) {
        this.d = (byte) 1;
        this.e = recyclerView;
        wph wphVar = (wph) this.f;
        if (wphVar != null) {
            this.f = wphVar;
        } else {
            this.f = new wph(this);
        }
    }

    public wph(wph wphVar) {
        this.d = (byte) 0;
        this.f = new WeakHashMap();
        this.e = wphVar;
    }

    @Override // defpackage.f8
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                f8 f8Var = (f8) ((WeakHashMap) this.f).get(view);
                return f8Var != null ? f8Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // defpackage.f8
    public final ole b(View view) {
        switch (this.d) {
            case 0:
                f8 f8Var = (f8) ((WeakHashMap) this.f).get(view);
                if (f8Var == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.b(view);
    }

    @Override // defpackage.f8
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        f fVar;
        switch (this.d) {
            case 0:
                f8 f8Var = (f8) ((WeakHashMap) this.f).get(view);
                if (f8Var == null) {
                    super.c(view, accessibilityEvent);
                    break;
                } else {
                    f8Var.c(view, accessibilityEvent);
                    break;
                }
            default:
                super.c(view, accessibilityEvent);
                if ((view instanceof RecyclerView) && !((RecyclerView) this.e).Z() && (fVar = ((RecyclerView) view).n) != null) {
                    fVar.onInitializeAccessibilityEvent(accessibilityEvent);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f8
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        f fVar;
        f fVar2;
        byte b = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (b) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
                wph wphVar = (wph) obj;
                if (!((RecyclerView) wphVar.e).Z() && (fVar = ((RecyclerView) wphVar.e).n) != null) {
                    fVar.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
                    f8 f8Var = (f8) ((WeakHashMap) this.f).get(view);
                    if (f8Var == null) {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        break;
                    } else {
                        f8Var.d(view, accessibilityNodeInfoCompat);
                        break;
                    }
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    break;
                }
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
                RecyclerView recyclerView = (RecyclerView) obj;
                if (!recyclerView.Z() && (fVar2 = recyclerView.n) != null) {
                    fVar2.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f8
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                f8 f8Var = (f8) ((WeakHashMap) this.f).get(view);
                if (f8Var == null) {
                    super.e(view, accessibilityEvent);
                    break;
                } else {
                    f8Var.e(view, accessibilityEvent);
                    break;
                }
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.f8
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                f8 f8Var = (f8) ((WeakHashMap) this.f).get(viewGroup);
                return f8Var != null ? f8Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                return super.f(viewGroup, view, accessibilityEvent);
        }
    }

    @Override // defpackage.f8
    public final boolean g(View view, int i, Bundle bundle) {
        f fVar;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                wph wphVar = (wph) obj;
                RecyclerView recyclerView = (RecyclerView) wphVar.e;
                RecyclerView recyclerView2 = (RecyclerView) wphVar.e;
                if (recyclerView.Z() || recyclerView2.n == null) {
                    return super.g(view, i, bundle);
                }
                f8 f8Var = (f8) ((WeakHashMap) this.f).get(view);
                if (f8Var != null) {
                    if (f8Var.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                return recyclerView2.n.performAccessibilityActionForItem(view, i, bundle);
            default:
                RecyclerView recyclerView3 = (RecyclerView) obj;
                if (super.g(view, i, bundle)) {
                    return true;
                }
                if (recyclerView3.Z() || (fVar = recyclerView3.n) == null) {
                    return false;
                }
                return fVar.performAccessibilityAction(i, bundle);
        }
    }

    @Override // defpackage.f8
    public final void h(View view, int i) {
        switch (this.d) {
            case 0:
                f8 f8Var = (f8) ((WeakHashMap) this.f).get(view);
                if (f8Var == null) {
                    super.h(view, i);
                    break;
                } else {
                    f8Var.h(view, i);
                    break;
                }
            default:
                super.h(view, i);
                break;
        }
    }

    @Override // defpackage.f8
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                f8 f8Var = (f8) ((WeakHashMap) this.f).get(view);
                if (f8Var == null) {
                    super.i(view, accessibilityEvent);
                    break;
                } else {
                    f8Var.i(view, accessibilityEvent);
                    break;
                }
            default:
                super.i(view, accessibilityEvent);
                break;
        }
    }
}
