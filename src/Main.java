//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ReproductorAudio reproductor = new ReproductorAudio();

    ControlRemoto control = new ControlRemoto(reproductor);

    control.reproducir();

    control.subirVolumen(80);

    control.pausar();

}
