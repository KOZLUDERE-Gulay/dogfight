package jpu2016.dogfight.controller;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {

    Missile missile = new Missile();
    private IDogfightModel dogfightModel;
    private IViewSystem viewSystem;
    private static int TIME_SLEEP = 30;


    public DogfightController(IDogfightModel dogfightModel){
        this.dogfightModel = dogfightModel;

    }



    public void play () {

    }

    public void SetViewSystem(IViewSystem viewSystem) {
        this.viewSystem = viewSystem;
    }

    private void LaunchMissile (int player) {

    }

    private void gameLoop()
    {

    }

    @Override
    public void orderPerform() {
        // TODO Auto-generated method stub

    }
}