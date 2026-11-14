package defpackage;

import android.text.Editable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.ActionBarSearchView;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.widget.spotlightcarousel.SpotlightCarouselLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class em3 implements nph {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ em3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(boolean z) {
    }

    private final void e(boolean z) {
    }

    private final void f(boolean z) {
    }

    private final void g(boolean z) {
    }

    private final void h(boolean z) {
    }

    private final void i(MotionEvent motionEvent) {
    }

    private final void j(MotionEvent motionEvent) {
    }

    private final void k(MotionEvent motionEvent) {
    }

    private final void l(MotionEvent motionEvent) {
    }

    private final void m(MotionEvent motionEvent) {
    }

    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        int iFindPointerIndex2;
        byte b = this.a;
        xkb xkbVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                im3 im3Var = (im3) obj;
                if (im3Var.H.hasFocus()) {
                    im3Var.K0();
                    break;
                }
                break;
            case 1:
                flb flbVar = (flb) obj;
                flbVar.B.onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2 && flbVar.c == null && flbVar.p == motionEvent.getPointerId(0)) {
                    flbVar.g = motionEvent.getX();
                    flbVar.h = motionEvent.getY();
                }
                if (actionMasked == 0) {
                    flbVar.p = motionEvent.getPointerId(0);
                    float x = motionEvent.getX();
                    flbVar.e = x;
                    flbVar.g = x;
                    float y = motionEvent.getY();
                    flbVar.f = y;
                    flbVar.h = y;
                    VelocityTracker velocityTracker = flbVar.x;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    flbVar.x = VelocityTracker.obtain();
                    if (flbVar.c == null) {
                        ArrayList arrayList = flbVar.t;
                        if (!arrayList.isEmpty()) {
                            View viewM = flbVar.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    xkb xkbVar2 = (elb) arrayList.get(size);
                                    if (xkbVar2.e.itemView == viewM) {
                                        xkbVar = xkbVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (xkbVar != null) {
                            i iVar = xkbVar.e;
                            flbVar.e -= xkbVar.k;
                            flbVar.f -= xkbVar.l;
                            flbVar.k(iVar, true);
                            if (flbVar.a.remove(iVar.itemView)) {
                                flbVar.q.d(flbVar.v, iVar);
                            }
                            flbVar.r(iVar, xkbVar.f);
                            flbVar.t(flbVar.s, motionEvent.getX(0), motionEvent.getY(0));
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    flbVar.p = -1;
                    flbVar.r(null, 0);
                } else {
                    int i = flbVar.p;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        flbVar.g(actionMasked, iFindPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = flbVar.x;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (flbVar.c == null) {
                    break;
                }
                break;
            case 2:
                glb glbVar = (glb) obj;
                glbVar.x.onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    glbVar.l = motionEvent.getPointerId(0);
                    glbVar.d = motionEvent.getX();
                    glbVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker3 = glbVar.t;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                    }
                    glbVar.t = VelocityTracker.obtain();
                    if (glbVar.c == null) {
                        ArrayList arrayList2 = glbVar.p;
                        if (!arrayList2.isEmpty()) {
                            View viewJ = glbVar.j(motionEvent);
                            int size2 = arrayList2.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    xkb xkbVar3 = (xkb) arrayList2.get(size2);
                                    if (xkbVar3.e.itemView == viewJ) {
                                        xkbVar = xkbVar3;
                                    } else {
                                        size2--;
                                    }
                                }
                            }
                        }
                        if (xkbVar != null) {
                            i iVar2 = xkbVar.e;
                            glbVar.d -= xkbVar.i;
                            glbVar.e -= xkbVar.j;
                            glbVar.i(iVar2, true);
                            if (glbVar.a.remove(iVar2.itemView)) {
                                glbVar.m.b(glbVar.r, iVar2);
                            }
                            glbVar.n(iVar2, xkbVar.f);
                            glbVar.o(glbVar.o, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 == 3 || actionMasked2 == 1) {
                    glbVar.l = -1;
                    glbVar.n((i) null, 0);
                } else {
                    int i2 = glbVar.l;
                    if (i2 != -1 && (iFindPointerIndex2 = motionEvent.findPointerIndex(i2)) >= 0) {
                        glbVar.g(actionMasked2, iFindPointerIndex2, motionEvent);
                    }
                }
                VelocityTracker velocityTracker4 = glbVar.t;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                if (glbVar.c == null) {
                    break;
                }
                break;
            case 3:
                oy oyVar = (oy) obj;
                ActionBarSearchView actionBarSearchView = (ActionBarSearchView) oyVar.i;
                if (actionBarSearchView != null && actionBarSearchView.hasFocus()) {
                    oyVar.b();
                    break;
                }
                break;
            case 4:
                c9j c9jVar = (c9j) obj;
                xtb[] xtbVarArr = c9j.w;
                if (((OperaTextInputEditText) c9jVar.t.d).hasFocus()) {
                    c9jVar.G0();
                    break;
                }
                break;
            case 5:
                if (motionEvent.getActionMasked() == 0) {
                    ((SpotlightCarouselLayoutManager) obj).h = true;
                    break;
                }
                break;
            default:
                r9l r9lVar = (r9l) obj;
                r9lVar.u();
                Editable text = r9lVar.q.o.getText();
                if (text == null || text.length() == 0) {
                    r9lVar.r(false);
                    break;
                }
                break;
        }
        return false;
    }

    public final void c(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (z) {
                    ((flb) obj).r(null, 0);
                    break;
                }
                break;
            case 2:
                if (z) {
                    ((glb) obj).n((i) null, 0);
                    break;
                }
                break;
        }
    }

    public final void d(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                flb flbVar = (flb) obj;
                flbVar.B.onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = flbVar.x;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (flbVar.p != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int iFindPointerIndex = motionEvent.findPointerIndex(flbVar.p);
                    if (iFindPointerIndex >= 0) {
                        flbVar.g(actionMasked, iFindPointerIndex, motionEvent);
                    }
                    i iVar = flbVar.c;
                    if (iVar != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (iFindPointerIndex >= 0) {
                                    flbVar.t(flbVar.s, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex));
                                    flbVar.q(iVar);
                                    RecyclerView recyclerView = flbVar.v;
                                    wkb wkbVar = flbVar.w;
                                    recyclerView.removeCallbacks(wkbVar);
                                    flbVar.v.postOnAnimation(wkbVar);
                                    flbVar.v.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = flbVar.x;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == flbVar.p) {
                                    flbVar.p = motionEvent.getPointerId(actionIndex != 0 ? 0 : 1);
                                    flbVar.t(flbVar.s, motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
                                    break;
                                }
                            }
                        }
                        flbVar.j();
                        flbVar.r(null, 0);
                        flbVar.p = -1;
                        break;
                    } else {
                        flbVar.j();
                        break;
                    }
                } else {
                    flbVar.j();
                    break;
                }
                break;
            case 2:
                glb glbVar = (glb) obj;
                vl9 vl9Var = glbVar.s;
                glbVar.x.onTouchEvent(motionEvent);
                VelocityTracker velocityTracker3 = glbVar.t;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                if (glbVar.l != -1) {
                    int actionMasked2 = motionEvent.getActionMasked();
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(glbVar.l);
                    if (iFindPointerIndex2 >= 0) {
                        glbVar.g(actionMasked2, iFindPointerIndex2, motionEvent);
                    }
                    i iVar2 = glbVar.c;
                    if (iVar2 != null) {
                        if (actionMasked2 != 1) {
                            if (actionMasked2 == 2) {
                                if (iFindPointerIndex2 >= 0) {
                                    glbVar.o(glbVar.o, iFindPointerIndex2, motionEvent);
                                    glbVar.m(iVar2);
                                    glbVar.r.removeCallbacks(vl9Var);
                                    vl9Var.run();
                                    glbVar.r.invalidate();
                                    break;
                                }
                            } else if (actionMasked2 == 3) {
                                VelocityTracker velocityTracker4 = glbVar.t;
                                if (velocityTracker4 != null) {
                                    velocityTracker4.clear();
                                }
                            } else if (actionMasked2 == 6) {
                                int actionIndex2 = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex2) == glbVar.l) {
                                    glbVar.l = motionEvent.getPointerId(actionIndex2 != 0 ? 0 : 1);
                                    glbVar.o(glbVar.o, actionIndex2, motionEvent);
                                    break;
                                }
                            }
                        }
                        glbVar.n((i) null, 0);
                        glbVar.l = -1;
                        break;
                    }
                }
                break;
        }
    }
}
