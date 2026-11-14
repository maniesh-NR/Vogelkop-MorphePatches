package org.chromium.device.sensors;

import J.N;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;

/* loaded from: classes.dex */
public final class PlatformSensor implements SensorEventListener {
    public final Object a = new Object();
    public long b;
    public final Sensor c;
    public final int d;
    public final byte e;
    public double f;
    public final PlatformSensorProvider g;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformSensor(Sensor sensor, int i, PlatformSensorProvider platformSensorProvider, long j) {
        this.e = i;
        this.g = platformSensorProvider;
        this.c = sensor;
        this.b = j;
        this.d = sensor.getMinDelay();
    }

    public static PlatformSensor create(PlatformSensorProvider platformSensorProvider, int i, long j) {
        int i2;
        SensorManager sensorManager = platformSensorProvider.a;
        if (sensorManager == null) {
            return null;
        }
        int i3 = 5;
        int i4 = 1;
        if (i == 0) {
            i2 = 1;
        } else if (i != 1) {
            i4 = 2;
            if (i == 2) {
                i3 = 10;
            } else if (i == 3) {
                i3 = 9;
            } else if (i != 4) {
                if (i != 5) {
                    if (i == 7) {
                        i3 = 11;
                    } else {
                        if (i != 9) {
                            return null;
                        }
                        i3 = 15;
                    }
                    i2 = 4;
                }
                i3 = i4;
            } else {
                i2 = 3;
                i3 = 4;
            }
            i2 = 3;
        } else {
            i3 = i4;
            i2 = 3;
        }
        List<Sensor> sensorList = sensorManager.getSensorList(i3);
        if (sensorList.isEmpty()) {
            return null;
        }
        return new PlatformSensor(sensorList.get(0), i2, platformSensorProvider, j);
    }

    public final boolean checkSensorConfiguration(double d) {
        return this.d <= ((int) ((1.0d / d) * 1000000.0d));
    }

    public final double getDefaultConfiguration() {
        return 5.0d;
    }

    public final double getMaximumSupportedFrequency() {
        int i = this.d;
        if (i == 0) {
            return 5.0d;
        }
        return 1.0d / (i * 1.0E-6d);
    }

    public final int getReportingMode() {
        return this.c.getReportingMode() == 0 ? 1 : 0;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.a) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            float[] fArr = sensorEvent.values;
            if (fArr.length < this.e) {
                if (j != 0) {
                    N.MrHXg7he(j);
                }
                stopSensor();
                return;
            }
            double d = 1.0E-9d * sensorEvent.timestamp;
            int length = fArr.length;
            if (length == 1) {
                N.Mb4JvlL7(j, d, fArr[0], 0.0d, 0.0d, 0.0d);
            } else if (length == 2) {
                N.Mb4JvlL7(j, d, fArr[0], fArr[1], 0.0d, 0.0d);
            } else if (length != 3) {
                N.Mb4JvlL7(j, d, fArr[0], fArr[1], fArr[2], fArr[3]);
            } else {
                N.Mb4JvlL7(j, d, fArr[0], fArr[1], fArr[2], 0.0d);
            }
        }
    }

    public final void sensorDestroyed() {
        synchronized (this.a) {
            this.b = 0L;
        }
    }

    public final void startSensor(double d) {
        boolean zRegisterListener;
        double d2 = this.f;
        if (d2 != d) {
            if (d2 != 0.0d) {
                this.g.a.unregisterListener(this, this.c);
            }
            PlatformSensorProvider platformSensorProvider = this.g;
            synchronized (platformSensorProvider.d) {
                if (platformSensorProvider.d.isEmpty() && platformSensorProvider.b == null) {
                    HandlerThread handlerThread = new HandlerThread("SensorsHandlerThread");
                    platformSensorProvider.b = handlerThread;
                    handlerThread.start();
                    platformSensorProvider.c = new Handler(platformSensorProvider.b.getLooper());
                }
                platformSensorProvider.d.add(this);
            }
            try {
                PlatformSensorProvider platformSensorProvider2 = this.g;
                zRegisterListener = platformSensorProvider2.a.registerListener(this, this.c, (int) ((1.0d / d) * 1000000.0d), platformSensorProvider2.c);
            } catch (RuntimeException unused) {
                zRegisterListener = false;
            }
            if (zRegisterListener) {
                this.f = d;
                return;
            }
            stopSensor();
            synchronized (this.a) {
                long j = this.b;
                if (j != 0) {
                    N.MrHXg7he(j);
                }
            }
        }
    }

    public final void stopSensor() {
        HandlerThread handlerThread;
        if (this.f != 0.0d) {
            this.g.a.unregisterListener(this, this.c);
        }
        PlatformSensorProvider platformSensorProvider = this.g;
        synchronized (platformSensorProvider.d) {
            platformSensorProvider.d.remove(this);
            if (platformSensorProvider.d.isEmpty() && (handlerThread = platformSensorProvider.b) != null) {
                handlerThread.quitSafely();
                platformSensorProvider.b = null;
                platformSensorProvider.c = null;
            }
        }
        this.f = 0.0d;
    }
}
