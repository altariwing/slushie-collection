private void browseURL()throws Exception{
    Desktop desktop=Desktop.getDesktop();

    //works well on linux
    desktop.browse(new URI("http://google.com"));

    //if on linux
    //java.lang.UnsupportedOperationException: The EDIT action is not supported on the current platform!
    //solution: https://stackoverflow.com/questions/18004150/desktop-api-is-not-supported-on-the-current-platform
    desktop.edit(new File("/home/altariwing/LOTTERY_F"));
    
//may test by method isSupported:    
//System.out.print(desktop.isSupported(Desktop.Action.EDIT));
}
