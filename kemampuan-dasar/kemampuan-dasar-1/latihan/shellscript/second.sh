$nama = "namasaya"
$daftarWarna = "Yellow", "Green", "Gray", "Black", "Blue"
foreach($warna in $daftarWarna) {
    Write-Host -ForegroundColor $warna $nama
}