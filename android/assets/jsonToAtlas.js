var fs = require('fs');


function toAtlas(file) {
  var contents = fs.readFileSync(file, 'utf8');

  contents = JSON.parse(contents);

  var oHeader = contents.meta.image + '\n' +
      'format: RGBA8888\n' +
      'filter: Nearest,Nearest\n' +
      'repeat: none\n';

  var oBody = Object.keys(contents.frames).map(function (key) {
    var frame = contents.frames[key];
    return key + '\n' +
      '  rotate: false\n' +
      '  xy: ' + frame.frame.x + ', ' + frame.frame.y + '\n' +
      '  size: ' + frame.frame.w + ', ' + frame.frame.h + '\n' +
      '  orig: ' + frame.spriteSourceSize.w + ', ' + frame.spriteSourceSize.h + '\n' +
      '  offset: ' + frame.spriteSourceSize.x + ', ' + frame.spriteSourceSize.y + '\n' +
      '  index: -1';
  }).join('\n');

  var oFooter = "";

  var result = oHeader + oBody + oFooter;

  console.log(result);
}

toAtlas(process.argv[2]);
