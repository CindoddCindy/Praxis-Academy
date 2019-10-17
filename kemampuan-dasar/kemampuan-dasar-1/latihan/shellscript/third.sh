[int] $i = 1

while ($i -lt 10) {
    "Nilai `$i adalah $i"
    $i++
}

# hasilnya sama dengan:

$i = 1
do {
    "Nilai `$i adalah $i"
    $i++
} until ($i -ge 10)

# hasilnya sama dengan:

foreach($i in 1..9) {
    "Nilai `$i adalah $i"
}

# hasilnya sama seperti:

for($i=1; $i -le 9; $i++) {
    "Nilai `$i adalah $i"
