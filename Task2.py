while True:
    speech = raw_input("Enter file name:")

    wholeFile = open(speech, 'r+').read()
    lowlet = wholeFile.lower()

    alphas = 'abcdefghijklmnopqrstuvwxyz'

    # lets set default values first
    occurrences = {letter : 0 for letter in alphas }
    total = 0

    # iter everything in the text
    for letter in lowlet:
        # if it is a valid letter then it is in occurrences
        if letter in occurrences:
            total += 1
            occurrences[letter] += 1

    # now print the results:
    for letter, count in occurrences.iteritems():
        print letter, (1.0*count/total)
