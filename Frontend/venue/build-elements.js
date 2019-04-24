const fs = require('fs-extra');
const concat = require('concat');
(async function build() {
  const files = [
    './dist/venue/runtime.js',
    './dist/venue/polyfills.js',
    './dist/venue/scripts.js',
    './dist/venue/main.js',
  ]
  await fs.ensureDir('elements')
  await concat(files, 'elements/venue.js');
  await fs.copyFile('./dist/venue/styles.css', 'elements/styles.css')
  // await fs.copy('./dist/venue/assets/', 'elements/assets/' )

})()
