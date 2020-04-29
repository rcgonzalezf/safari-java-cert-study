module Service {
  exports theservice.spi; // general access to public package stuff
  opens theservice; // permits reflection mechanisms
}